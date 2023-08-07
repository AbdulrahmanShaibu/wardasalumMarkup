class Room {
    private double width;
    private double length;
    private int floor;

    public Room() {
        this.width = 10;
        this.length = 12.5;
        this.floor = 1;
    }

    public Room(double width, double length, int floor) {
        setWidth(width);
        setLength(length);
        this.floor = floor;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return length + " x " + width + ", floor " + floor;
    }
}

class Classroom extends Room {
    private int numStudents;

    public Classroom(double width, double length, int floor, int numStudents) {
        super(width, length, floor);
        this.numStudents = numStudents;
    }

    public int getNumStudents() {
        return numStudents;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity = " + numStudents + " students";
    }

    public static Classroom[] filterClassrooms(Room[] rooms) {
        int numClassrooms = 0;
        for (Room room : rooms) {
            if (room instanceof Classroom) {
                numClassrooms++;
            }
        }

        Classroom[] classrooms = new Classroom[numClassrooms];
        int index = 0;
        for (Room room : rooms) {
            if (room instanceof Classroom) {
                classrooms[index++] = (Classroom) room;
            }
        }
        return classrooms;
    }
}

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room();
        System.out.println("class 1: " + room1);

        Room room2 = new Room(8.5, 11.0, 2);
        System.out.println("class 2: " + room2);

        Classroom classroom1 = new Classroom(10.0, 15.0, 1, 30);
        System.out.println("room 3: " + classroom1);

        Classroom classroom2 = new Classroom(12.0, 18.0, 3, 40);
        System.out.println("room  4: " + classroom2);

        Room[] allRooms = { room1, room2, classroom1, classroom2 };
        Classroom[] classrooms = Classroom.filterClassrooms(allRooms);

        System.out.println("no of rooms: ");
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }
}

