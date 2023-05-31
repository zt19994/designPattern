package com.designpattern.behaviorPattern.interpreter;

/**
 * @author zhongtao
 * @date 2023/5/31 10:35
 */
public class InterpreterPatternDemo {

    //规则：小王 和 小明 是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("小王");
        Expression john = new TerminalExpression("小明");
        return new OrExpression(robert, john);
    }

    //规则：小红 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("小红");
        Expression married = new TerminalExpression("结婚");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("小王是男性? " + isMale.interpret("小王"));
        System.out.println("小红是一个已婚的女性? " + isMarriedWoman.interpret("结婚的小红"));
    }
}