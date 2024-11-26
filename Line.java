public class Line {
    private Point destination;
    private Point origine;
    private Float length;
    private String streetName;

    public Line(Point destination, Point origine, Float length, String streetName) {
        this.destination = destination;
        this.origine = origine;
        this.length = length;
        this.streetName = streetName;
    }

    public Point getDestination() {
        return destination;
    }
    public Point getOrigine() {
        return origine;
    }
    public Float getLength() {
        return length;
    }
    public String getStreetName() {
        return streetName;
    }

    @Override
    public String toString() {
        return "Line [destination=" + destination + ", origine=" + origine + ", length=" + length;
    }
}
