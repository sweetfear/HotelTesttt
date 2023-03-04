package ZadachaChata;

public class Hotel {
    private int roomNumber;
    private int floor;
    private int rooms;
    private TypeRoom typeRoom;

    public Hotel(int roomNumber, int floor, int rooms, TypeRoom typeRoom) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.rooms = rooms;
        this.typeRoom = typeRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public int getRooms() {
        return rooms;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }


}