public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PingPonger first = new PingPonger("pong");
        System.out.println("PingPonger state - pong : " + first.pong());
        System.out.println("PingPonger state - pong : " + first.ping());
        System.out.println("PingPonger state - pong : " + first.ping());


        PingPonger second = new PingPonger("ping");
        System.out.println("PingPonger state - Ping : " + second.ping());
        System.out.println("PingPonger state - Ping: " + second.ping());

        PingPonger third = new PingPonger("Whoops");


    }
}