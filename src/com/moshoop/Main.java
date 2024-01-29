package com.moshoop;

public class Main {
    public static void main(String[] args) {
//        var employee1 = new Employee();
//        var employee2 = new Employee(50_000, 30);
//
//        System.out.println(employee2.calculateWage(10));
//        Employee.printNumberOfEmployees();

//        Account account1 = new Account(50_000);
//
//        account1.deposit(10_000);
//        account1.withdraw(13_000);

//        var box1 = new TextBox();
//        box1.setText("tommy");
//        System.out.println(box1);

//        upcasting and down-casting
//        var control = new UIControl(true);
//        var box1 = new TextBox();
//        show(control);


//        var textbox = new TextBox();
//        var point1 = new Point(1,2);
//        var point2 = new Point(1, 2);
//
//        System.out.println(point1.equals(point2));
//
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls)
            control.render();
    }

//    public static void show(UIControl control) {
//        if(control instanceof TextBox) {
//            var textBox = (TextBox) control;
//            textBox.setText("Hey there");
//        }
//        System.out.println(control);
//    }
}
