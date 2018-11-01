package anikina.olga.tasks.java.test;

import anikina.olga.tasks.java.main.firstTask.Ball;
import anikina.olga.tasks.java.main.firstTask.Container;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BallTests {
    private static final double DELTA = 0.1;

    @Test
    public void isDeltaYRight() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);

        ball.move();

        assertEquals(0, ball.getyDelta(), DELTA);
    }

    @Test
    public void isDeltaXRight() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);

        ball.move();

        assertEquals(2, ball.getxDelta(), DELTA);
    }

    @Test
    public void isMoveRightOnX() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);

        ball.move();

        assertEquals(3.0f, ball.getX(), DELTA);
    }

    @Test
    public void isMoveRightOnY() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);

        ball.move();

        assertEquals(0.0f, ball.getY(), DELTA);
    }

    @Test
    public void isReflectionVerticalRight() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);

        ball.reflectVertical();

        assertEquals(-0.0f, ball.getY(), DELTA);
    }

    @Test
    public void isReflectionHorizontal() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);

        ball.reflectHorizontal();

        assertEquals(-1.0f, ball.getX(), DELTA);
    }

    @Test
    public void isBallInContainer() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);
        Container container = new Container(-1,10,15,15);

        assertEquals(true, container.collides(ball));
    }

    @Test
    public void isBallInContainerAtherMove() {
        Ball ball = new Ball(1.0f, 0.0f, 2, 0, 1);
        Container container = new Container(-1,10,15,15);
        ball.move();

        assertEquals(true, container.collides(ball));
    }


}
