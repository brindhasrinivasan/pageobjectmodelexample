package testNg;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeneg implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("onStart");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("onFinish");
    }
}
