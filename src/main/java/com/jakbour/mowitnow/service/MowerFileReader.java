package com.jakbour.mowitnow.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.jakbour.mowitnow.model.Command;
import com.jakbour.mowitnow.model.Direction;
import com.jakbour.mowitnow.model.Field;
import com.jakbour.mowitnow.model.Mower;
import com.jakbour.mowitnow.model.Position;

public class MowerFileReader {

    public static Field reader() {
        Field field = null; 
        String fileName = "src/test/test-case";
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            Position limit = mapPosition(lines.get(0));
            List<Mower> mowers = lines.stream().skip(1).map(MowerFileReader::mapLineMower).collect(Collectors.toList());
            field = new Field(mowers, limit);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return field;
    }

    private static Mower mapLineMower(String line) {
        String[] str = line.split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        String direction = str[2];
        String cmd = str[3];
        Position p = new Position(x, y);

        List<Command> cmds = Arrays.stream(cmd.split(""))
                                    .map(Command::getById)
                                    .collect(Collectors.toList());
        return new Mower(p, Direction.getById(direction), cmds);
    }

    private static Position mapPosition(String line) {
        String[] str = line.split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        return new Position(x, y);
    }
}
