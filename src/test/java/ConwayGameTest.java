import sun.jvm.hotspot.utilities.Assert;

public class ConwayGameTest {

    Conway p = new Conway();
    int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };
    @Test
    public void liveCellFewerThanTwo() {
        Assert.assertEquals(p.nextGeneration(grid[][],5,5));
    }
    @Test
    public void liveCellWithTwoOrThreeNeighbours() {
        Assert.assertEquals(p.nextGeneration(grid[][],8,8));
    }
    @Test
    public void liveCellWithMoreThanThree() {
        Assert.assertEquals(p.nextGeneration(grid[][],6,6));
    }
    @Test
    public void liveCellWithExactlyThreeLiveNeighbours() {
        Assert.assertEquals(p.nextGeneration(grid[][]7,7));
    }
}
