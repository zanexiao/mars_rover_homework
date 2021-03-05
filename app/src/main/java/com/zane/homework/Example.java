package com.zane.homework;

import com.zane.homework.property.Coordinate;
import com.zane.homework.property.Direction;
import com.zane.homework.property.Plateau;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example {

    public static void main(String[] args) {
        readRun("input.txt");
    }

    private static void readRun(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String maxSize = reader.readLine();
            if (maxSize == null) {
                return;
            }
            int xSize, ySize;
            String[] size = maxSize.split(" ");
            xSize = Integer.parseInt(size[0]);
            ySize = Integer.parseInt(size[1]);
            Plateau plateau = new Plateau(xSize, ySize);

            String coordinateStr;
            int xCoordinate, yCoordinate;
            while ((coordinateStr = reader.readLine()) != null) {
                System.out.println(new File("../../../../input.txt").getAbsolutePath());
                String[] coordinates = coordinateStr.split(" ");
                xCoordinate = Integer.parseInt(coordinates[0]);
                yCoordinate = Integer.parseInt(coordinates[1]);
                Coordinate coordinate = new Coordinate(xCoordinate, yCoordinate);
                MarsRover marsRover = new MarsRover(plateau, coordinate, Direction.formName(coordinates[2]));
                String command = reader.readLine();
                marsRover.run(command);
                System.out.println(marsRover.output());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
