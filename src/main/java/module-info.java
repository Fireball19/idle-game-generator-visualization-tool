module Main {
  requires javafx.controls;
  requires java.desktop;
  requires com.fasterxml.jackson.databind;

  exports idle.game.generator.visualization.tool;
  exports idle.game.generator.visualization.tool.ui;
  exports idle.game.generator.visualization.tool.io;
  exports idle.game.generator.visualization.tool.domain;
  exports idle.game.generator.visualization.tool.domain.io;
  exports idle.game.generator.visualization.tool.domain.io.json;

  opens idle.game.generator.visualization.tool to javafx.graphics;
  opens idle.game.generator.visualization.tool.ui to javafx.graphics;
  opens idle.game.generator.visualization.tool.io to javafx.graphics;
  opens idle.game.generator.visualization.tool.domain to javafx.graphics;
  opens idle.game.generator.visualization.tool.domain.io to javafx.graphics;
  opens idle.game.generator.visualization.tool.domain.io.json to javafx.graphics;
}