package stackADT.infixToSuffix;

import stackADT.StackADT;

/**
 * @description：利用后缀进行数学运算
 * @modified By：
 * @version: $
 */
public class InfixToSuffix {

    /**
    *@Description: 主函数
    *@Param:
    *@return:
    */
    public Integer infixToSuffix(String s){
        //计算符号栈
        StackADT<Character> symbolStack = new StackADT<>();
        //值栈
        StackADT<Integer> numStack = new StackADT<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                numStack.push(Integer.parseInt(String.valueOf(s.charAt(i))));
            else if (s.charAt(i) == ')'){
                while (symbolStack.top() != '('){
                    numStack.push(calculation(symbolStack.pop(), numStack.pop(), numStack.pop()));
                }
                symbolStack.pop();
            }else if (s.charAt(i) == '(')
                symbolStack.push('(');
            else {
                while (symbolStack.getHigh() != 0 && !compare(symbolStack.top(), s.charAt(i))){
                    numStack.push(calculation(symbolStack.pop(), numStack.pop(), numStack.pop()));
                }

                symbolStack.push(s.charAt(i));
            }
        }

        //清空符号栈
        while (symbolStack.getHigh() != 0)
            numStack.push(calculation(symbolStack.pop(), numStack.pop(), numStack.pop()));

        return numStack.top();
    }

    /**
    *@Description: 对比符号优先级工具类
    *@Param:
    *@return:
    */
    static boolean compare(Character firstSymbol, Character OtherSymbol) {
        if(firstSymbol == '(')
            return true;
        if (OtherSymbol == '*' || OtherSymbol == '/') {
            if (firstSymbol == '+' || firstSymbol == '-')

                return true;
        }

        return false;
    }

    /**
     *@Description: 数学计算
     *@Param:
     *@return:
     */
    Integer calculation (Character symbol, Integer b, Integer a){
        if (symbol.equals('*'))

            return a*b;
        if (symbol.equals('/'))

            return a/b;

        if (symbol.equals('+'))

            return a+b;

        return a-b;
    }
}
