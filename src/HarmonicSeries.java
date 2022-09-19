public class HarmonicSeries {
    public static void main(String[] args) {
        double [] list= {1,2,3,4,5};
        double harmonicAverage = 0;
        for (double i : list){
            harmonicAverage += (1 / i);
        }
        harmonicAverage = list.length / harmonicAverage;
        System.out.print("Harmonic Average is: " + (harmonicAverage));
    }
}
