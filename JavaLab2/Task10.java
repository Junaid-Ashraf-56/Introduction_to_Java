public class Task10 {
        public static void main(String[] args) {
            System.out.printf("%-7s %-7s %-7s %-7s %-7s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
            int degrees = 30;
            double radians = Math.toRadians(degrees);
            double sin = Math.sin(radians);
            double cos = Math.cos(radians);
            double tan = Math.tan(radians);
            System.out.printf("%-7d %-7.4f %-7.4f %-7.4f %-7.4f%n", degrees, radians, sin, cos, tan);
            degrees = 60;
            radians = Math.toRadians(degrees);
            sin = Math.sin(radians);
            cos = Math.cos(radians);
            tan = Math.tan(radians);
            System.out.printf("%-7d %-7.4f %-7.4f %-7.4f %-7.4f%n", degrees, radians, sin, cos, tan);
        }
    }
    

