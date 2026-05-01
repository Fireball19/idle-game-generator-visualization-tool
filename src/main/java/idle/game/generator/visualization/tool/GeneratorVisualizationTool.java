package idle.game.generator.visualization.tool;

import idle.game.generator.visualization.tool.domain.io.GeneratorReader;
import idle.game.generator.visualization.tool.domain.io.GeneratorWriter;
import idle.game.generator.visualization.tool.domain.io.json.GeneratorJSONMapper;
import idle.game.generator.visualization.tool.domain.io.json.GeneratorJSONReader;
import idle.game.generator.visualization.tool.domain.io.json.GeneratorJSONWriter;
import idle.game.generator.visualization.tool.io.FileReader;
import idle.game.generator.visualization.tool.io.FileWriter;
import idle.game.generator.visualization.tool.ui.UI;
import javafx.application.Application;
import javafx.stage.Stage;

public class GeneratorVisualizationTool extends Application {
 
    @Override public void start(Stage stage) {
      final FileReader fileReader = new FileReader();
      final FileWriter fileWriter = new FileWriter();
      final GeneratorJSONMapper generatorJSONMapper = new GeneratorJSONMapper();
      final GeneratorReader generatorReader = new GeneratorJSONReader(fileReader, generatorJSONMapper);
      final GeneratorWriter generatorWriter = new GeneratorJSONWriter(fileWriter, generatorJSONMapper);
    	final UI ui = new UI(stage, generatorReader, generatorWriter);
    	
      stage.setTitle("Idle-Game Generator Visualization Tool");
      stage.setResizable(false);
      stage.setScene(ui.getScene());
      stage.show();
    }
 
    public static void main(String[] args) {
    	Application.launch(GeneratorVisualizationTool.class);
    }
}