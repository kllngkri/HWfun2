public class PolarVector {
    double length;
    double direction;

    public PolarVector(double length,double direction){
        this.direction = direction;
        this.length = length;
    }

    public double getProjectionX() {
        return length * Math.cos(direction);
    }

    public double getProjectionY() {
        return length * Math.sin(direction);
    }

    public Vector toVector(){
        return new Vector(length,direction);
    }

    public void print(){
        System.out.println("Polar: "+length+"<"+direction);
    }




}
