public class PingPonger {

    String state = null;
    public PingPonger(String state) {

        if (state.equalsIgnoreCase("ping") || state.equalsIgnoreCase("pong")) {
            this.state = state;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean pong() {

        if (this.state.equals("pong")) {
            this.state = "ping";
            return false;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean ping() {
        if (this.state.equals("ping")) {
            this.state = "pong";
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
