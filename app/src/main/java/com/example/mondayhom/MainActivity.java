package com.example.mondayhom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mondayhom.Cat.UsualCat;
import com.example.mondayhom.phone.Network;
import com.example.mondayhom.phone.Phone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsualCat usualcat = new UsualCat();
        usualcat.getUsual(30);
        usualcat.getUsual(30.0);
        usualcat.print();

        Triangle triangle = new Triangle();
        System.out.println("Length1 =  " + triangle.getLength1(10));
        System.out.println("High = " + triangle.getHigh(5));
        System.out.println("Square = " + triangle.getSquare());

        Vector3d vector3d = new Vector3d();
        vector3d.Vector();
        vector3d.getSumV(3, 4, 2);

        Phone phone = new Phone();
        phone.getColor();
        phone.getDiagonal(5);
        phone.getNuber(05012312323);
        phone.getSim2();

        Network network = new Network();
        network.getNumber(05012312323);
        network.Call(true);
    }
}
