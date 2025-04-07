package Mediator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TowerControl implements AirTrafficControl{
    private Aircraft currentLandingAircraft;
    private Queue<Aircraft> waitingLandingAircraft = new LinkedList<>();

    @Override
    public boolean requestLanding(Aircraft aircraft) {
        if (currentLandingAircraft != null) {
            System.out.println("[ATC] Máy bay " + aircraft.getName()
                    + ": Không thể hạ cánh ngay bây giờ. Hãy chờ.");

            waitingLandingAircraft.add(aircraft);

            System.out.println("[ATC Danh sách máy bay chờ hạ cánh: ");
            for(Aircraft ac : waitingLandingAircraft) {
                System.out.println(ac.getName());
            }
            return false;
        }
        currentLandingAircraft = aircraft;
        System.out.println("[ATC] Máy bay " + aircraft.getName() + ": Được phép hạ cánh.");
        return true;
    }

    @Override
    public void notifyAircraft(Aircraft aircraft, String message) {
        System.out.println("[ATC] Gửi thông báo đến " + aircraft.getName() + ": " + message);
    }

    @Override
    public void aircraftLanded(Aircraft aircraft) {
        System.out.println("[ATC] Máy bay " + aircraft.getName() + " đã hạ cánh. Dọn đường băng!");
    }

    @Override
    public void releaseLanding() {
        currentLandingAircraft = null;
        System.out.println("[ATC] Đã dọn đường băng, máy bay: " +
                waitingLandingAircraft.peek().getName() + "được phép hạ cánh");
    }
}
