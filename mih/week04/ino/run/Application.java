package com.ino.run;

import com.ino.controller.ChundbController;

public class Application {
    public static void main(String[] args) {
        ChundbController chundbController = new ChundbController();
        chundbController.selectDeptScore();
    }
}
