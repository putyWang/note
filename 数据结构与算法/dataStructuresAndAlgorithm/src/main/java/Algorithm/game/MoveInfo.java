package Algorithm.game;

/**
 * 极小极大策略
 */
public class MoveInfo {

    //棋子移动的位置
    public Integer move;
    //博弈结果 包含电脑赢
    public Result value;

    public MoveInfo(Integer move, Result value) {
        this.move = move;
        this.value = value;
    }


    /**
     * 模拟计算机走棋
     * @return
     */
    public MoveInfo findCompMove () {

        Result responseValue;
        Result value;
        int bestMove = 1;
        //快速步骤
        MoveInfo quickWinInfo;

        //判断棋盘是否充满，平局
        if (fullBoard()) {
            value = Result.DRAW;
        }
        //判断电脑直接胜利步骤是否存在
        else if ( (quickWinInfo = immediateCompWin()) != null) {
            return quickWinInfo;
        } else {
            value = Result.COMP_LOSS;

            //从位置1到9 逐步试错
            for (int i = 0; i <= 9; i++) {

                //位置i为空时，放置棋子
                if (isEmpty(i) ) {
                    place(i, "COMP");
                    responseValue = findHumanMove().value;
                    unPlace(i);

                    //进行人机博弈
                    if (responseValue.getCode() > value.getCode()) {
                        value = responseValue;
                        bestMove = i;
                    }
                }
            }
        }

        return new MoveInfo(bestMove, value);
    }

    /**
     * 模拟人走棋
     * @return
     */
    public MoveInfo findHumanMove () {

        Result responseValue;
        Result value;
        int bestMove = 1;
        //快速步骤
        MoveInfo quickWinInfo;

        //判断棋盘是否充满，平局
        if (fullBoard()) {
            value = Result.DRAW;
        }
        //判断电脑直接胜利步骤是否存在
        else if ( (quickWinInfo = immediateHumanWin()) != null) {
            return quickWinInfo;
        } else {
            value = Result.COMP_LOSS;

            //从位置1到9 逐步试错
            for (int i = 0; i <= 9; i++) {

                //位置i为空时，放置棋子
                if (isEmpty(i) ) {
                    place(i, "HUMAN");
                    responseValue = findCompMove().value;
                    unPlace(i);

                    //进行人机博弈
                    if (responseValue.getCode() < value.getCode()) {
                        value = responseValue;
                        bestMove = i;
                    }
                }
            }
        }

        return new MoveInfo(bestMove, value);
    }

    /**
     * 棋盘中是否已经充满
     * @return
     */
    private boolean fullBoard () {
        return move == 1;
    }

    /**
     * 表明直接电脑胜利的步骤
     * @return
     */
    private MoveInfo immediateCompWin () {
        return this;
    }

    /**
     * 表明直接电脑胜利的步骤
     * @return
     */
    private MoveInfo immediateHumanWin () {
        return this;
    }

    /**
     * 向i处下入棋子
     * @param i 目标位置
     * @param operation 操作人
     */
    private void place(Integer i, String operation) {}

    /**
     * 判断i处是否为空
     * @param i 棋盘位置
     * @return
     */
    private boolean isEmpty(Integer i) {return i == 1;}

    /**
     * 拿掉位置i处的棋子
     * @param i 棋盘位置
     */
    private void unPlace(Integer i) {}


}
