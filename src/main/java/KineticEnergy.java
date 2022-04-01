import java.util.Scanner;

public class KineticEnergy {
    static float m = 0,v = 0;
    public static float linearEnergy(float m,float v){
        float kl= (1.2f/2.0f)*m*(v*v);
        return kl;

    }
    public static float angularEnergy(){
        float i = 0,w=0;
        float ka = (1.2f/2.0f)*i*(w*w);
        return ka;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the ball(m): ");
        float m = sc.nextFloat();
        System.out.println("Enter Linear Velocity of the ball(m/s): ");
        float v = sc.nextFloat();
       float kt = (KineticEnergy.linearEnergy(m,v)+KineticEnergy.angularEnergy());
        if(kt < 0){
            System.out.println("Kinetic Energy cannot be Negative. Please check your input values.");
        }
        else{
            System.out.println("The Kinetic Energy is "+kt+" J.");
        }
    }
}
