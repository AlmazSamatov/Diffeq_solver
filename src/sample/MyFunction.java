package sample;

public class MyFunction implements Function{
    @Override
    public double getFunctionValue(double x, double y) {
        return 2 * (Math.sqrt(y) + y);
    }

    @Override
    public double getSolvedFunctionValue(double c, double x, double y) {
        double expression = c * Math.pow(Math.E, x) - 1;
        return Math.pow(expression, 2);
    }

    @Override
    public double getCoefficient(double x0, double y0){
        return (Math.sqrt(y0) + 1) / Math.pow(Math.E, x0);
    }
}
