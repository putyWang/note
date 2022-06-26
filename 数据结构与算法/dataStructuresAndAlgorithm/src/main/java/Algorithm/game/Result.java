package Algorithm.game;

/**
 * 博弈结果
 */
public enum Result {

    /**
     * 电脑输
     */
    COMP_LOSS(-1, "电脑输"),
    /**
     * 平局
     */
    DRAW(0, "平局"),
    /**
     * 用户赢
     */
    COMP_WIN(1, "用户赢");

    private Integer code;
    private String detail;

    public Integer getCode() {
        return code;
    }

    public String getDetail() {
        return detail;
    }

    Result (Integer code, String detail) {

        this.code = code;
        this.detail = detail;
    }
}
