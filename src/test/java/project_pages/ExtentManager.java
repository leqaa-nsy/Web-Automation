package project_pages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        // التأكد من وجود مجلد باسم reports قبل التشغيل
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("reports/AutomationReport.html");
        htmlReporter.config().setReportName("Test Execution Report");
        htmlReporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // إضافة أسماء الفريق كمعلومات للنظام
        extent.setSystemInfo("Team Members", "Leqaa Naeem, Aya Abdelaziz, Eslam Farag, Pola Hany, Abderahman Osama, Ahmed Ezz");
        extent.setSystemInfo("Project", "Automation Testing Project");

        return extent;
    }
}
