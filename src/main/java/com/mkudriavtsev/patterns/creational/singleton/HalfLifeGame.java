package main.java.com.mkudriavtsev.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HalfLifeGame {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Enemy> enemies = new ArrayList<>();
        MainHero gordonFreeman = MainHero.GORDON_FREEMAN;

        enemies.add(new Enemy("AllianceWarrior1", 5));
        enemies.add(new Enemy("AllianceWarrior2", 7));
        enemies.add(new Enemy("AllianceWarrior3", 8));
        enemies.add(new Enemy("AllianceWarrior4", 3));
        for (Enemy enemy: enemies) {
            executorService.execute(() -> {
                gordonFreeman.damage(enemy);
            });
        }
        executorService.shutdown();
        System.out.println(gordonFreeman.getHealth());
    }
}
