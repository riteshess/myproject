package GlReportApp.view.Servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.sql.DataSource;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXhtmlExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.JRXmlExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class ComparisonSheetDetailServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType(CONTENT_TYPE);


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {


            Context ctx = new InitialContext();
            DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/FINDS");
            conn = ds.getConnection();

            ps = conn.prepareStatement("select distinct srvr_Loc_As_Rpt_Path from APP.App$Servr$Loc");

            rs = ps.executeQuery();
            String path = null;
            while (rs.next()) {
               // path="D:\\Report from 220\\Report\\";
                path = rs.getString(1);
                // System.out.println("Path is :" + rs.getString(1));
            }

            //InputStream input = new FileInputStream(new File("D:/Report/Comparision_detail.jrxml"));
            InputStream input = new FileInputStream(new File(path + "Comparision_detail.jrxml"));

            JasperDesign design = JRXmlLoader.load(input);
            JasperReport report = JasperCompileManager.compileReport(design);

            //Getting Parameter from the servelt

            String reporttype = String.valueOf(request.getParameter("ReportType1"));
            String Org = (request.getParameter("organisation1"));

            String toDate = null;
            String fromDate = null;

            Integer coaid = null;

            String cldid = request.getParameter("cldid1");
            Integer slocid = Integer.parseInt(request.getParameter("slocid1"));
            String bankCash = null;
            String month = null;

            //Month------
            if (request.getParameter("Month1").equals("")) {
                month = null;
            } else {
                month = request.getParameter("Month1");
            }

            //BankCash-------

            if (request.getParameter("bankcash1").equals("")) {
                bankCash = null;
            } else {
                bankCash = request.getParameter("bankcash1");
            }


            //COA Id-------

            if (request.getParameter("coaId1").toString().equals("")) {
                coaid = null;
            } else {
                coaid = Integer.parseInt(request.getParameter("coaId1").toString());
            }

            //From Date-------

            if (request.getParameter("fromdate1").equals("")) {
                fromDate = null;
            } else {
                fromDate = request.getParameter("fromdate1");
            }


            //To Date----------

            if (request.getParameter("todate1").equals("")) {
                toDate = null;
            } else {
                toDate = request.getParameter("todate1");
            }


            //Report Type----------------
            if (reporttype.equals("")) {
                reporttype = "pdf";
            }
            //putting the parameter to map to report jrxml file

            Map parameters = new HashMap();

            parameters.put("Org_ID", Org);
            parameters.put("ToDate", toDate);
            parameters.put("FromDate", fromDate);
            parameters.put("SLOC_ID", slocid);
            parameters.put("CldId", cldid);
            parameters.put("Coa_ID", coaid);
            parameters.put("bankcash", bankCash);
            parameters.put("PARM_MON", month);
            parameters.put("reportType", reporttype);
            parameters.put("Path",path);

            /* System.out.println("   " + Org + "  " + toDate + "   " + fromDate + "  " + slocid + "  " + cldid + "  " +
                               coaid + "  " + bankCash + "  " + month + "  " + reporttype);
 */

            JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, conn);
            OutputStream ouputStream = response.getOutputStream();
            JRExporter exporter = null;


            if ("pdf".equalsIgnoreCase(reporttype)) {
                response.setContentType("application/pdf");
                response.setHeader("Content-Disposition", "attachement; filename=\"ComparisonSheetDetail.pdf\"");

                exporter = new JRPdfExporter();
                //exporter.setParameter(JRPdfExporterParameter.IS_CREATING_BATCH_MODE_BOOKMARKS, true);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);
            } else if ("rtf".equalsIgnoreCase(reporttype)) {
                response.setContentType("application/rtf");
                response.setHeader("Content-Disposition", "attachement; filename=\"ComparisonSheetDetail.rtf\"");


                exporter = new JRHtmlExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);
            } else if ("html".equalsIgnoreCase(reporttype))

            {


                exporter = new JRXhtmlExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);
            } else if ("xls".equalsIgnoreCase(reporttype)) {
                response.setContentType("application/xls");
                response.setHeader("Content-Disposition", "attachement; filename=\"ComparisonSheetDetail.xls\"");


                exporter = new JRXlsExporter();
                exporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, true);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);
            } else if ("docx".equalsIgnoreCase(reporttype)) {
                response.setContentType("application/docx");
                response.setHeader("Content-Disposition", "attachement; filename=\"ComparisonSheetDetail.docx\"");


                exporter = new JRDocxExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);
            } else if ("xlsx".equalsIgnoreCase(reporttype)) {
                response.setContentType("application/xlsx");
                response.setHeader("Content-Disposition", "attachement; filename=\"ComparisonSheetDetail.xlsx\"");


                exporter = new JRXlsxExporter();
                exporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, true);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);
            } else if ("xml".equalsIgnoreCase(reporttype)) {
                response.setContentType("application/xml");
                response.setHeader("Content-Disposition", "attachement; filename=\"ComparisonSheetDetail.xml\"");


                exporter = new JRXmlExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);
            }

            try {
                exporter.exportReport();
            } catch (JRException e) {
                throw new ServletException(e);
            } finally {
                if (ouputStream != null) {
                    try {
                        
                        if(rs!=null){
                            rs.close();
                        }
                        if(ps!=null){
                            ps.close();
                        }


                        if (conn != null) {
                            conn.close();
                        }
                        ouputStream.flush();
                        ouputStream.close();

                    } catch (IOException ex) {
                        // System.out.println(ex.getMessage());
                        throw (ex);
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
