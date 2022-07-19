module company.pingpong_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens company.pingpong_game to javafx.fxml;
    exports company.pingpong_game;
}