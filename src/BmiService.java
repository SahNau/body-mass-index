public class BmiService {
    public float  calculate(float  weight, int rise) {
        float bodyMass = weight / (rise * rise);
        return bodyMass ;
    }
}