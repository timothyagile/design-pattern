    package Mediator;

    public class Aircraft {
        private String name;
        private AirTrafficControl atc;

        public Aircraft(String name, AirTrafficControl atc) {
            this.name = name;
            this.atc = atc;
        }

        public String getName() {
            return name;
        }

        public void requestLanding() {
            if (atc.requestLanding(this)) {
                land();
            }
        }

        private void land() {
            System.out.println("[Máy bay " + name + "] Hạ cánh thành công!");
            atc.aircraftLanded(this);
        }
    }
