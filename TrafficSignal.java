public class TrafficSignal {
    public void startSimulation(int lanes, int durationSeconds) {
        System.out.println("Traffic Signal Simulation Started...");
        
        for (int i = 1; i <= lanes; i++) {
            System.out.println("Lane " + i + " - GREEN for " + durationSeconds + " seconds.");
            waitSeconds(durationSeconds);
            System.out.println("Lane " + i + " - RED");
        }
        
        System.out.println("Simulation Completed.");
    }

    private void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Simulation interrupted: " + e.getMessage());
        }
    }
}