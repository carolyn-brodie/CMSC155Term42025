package week5.storm;

public interface StormType {
    //Constants
    double PREDICTED_DAMAGE_LEVEL_0 = 1000;
    double PREDICTED_DAMAGE_LEVEL_1 = 5000;
    double PREDICTED_DAMAGE_LEVEL_2 = 100000;
    double PREDICTED_DAMAGE_LEVEL_3 = 500000;
    double PREDICTED_DAMAGE_LEVEL_4 = 1000000;
    int BAD_HURRICANE_CUTOFF = 130;
    int BAD_TORNADO_CUTOFF = 157;
    int BAD_THUNDERSTORM_CUTOFF = 60;


    double predictDamageInDollars();
}
