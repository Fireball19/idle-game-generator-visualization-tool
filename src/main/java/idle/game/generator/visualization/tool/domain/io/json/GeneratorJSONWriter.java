package idle.game.generator.visualization.tool.domain.io.json;

import idle.game.generator.visualization.tool.domain.Generator;
import idle.game.generator.visualization.tool.domain.io.GeneratorWriter;
import idle.game.generator.visualization.tool.io.FileWriter;

public class GeneratorJSONWriter implements GeneratorWriter {

  private final FileWriter fileWriter;
  private final GeneratorJSONMapper generatorJSONMapper;

  public GeneratorJSONWriter(FileWriter fileWriter, GeneratorJSONMapper generatorJSONMapper) {
    this.fileWriter = fileWriter;
    this.generatorJSONMapper = generatorJSONMapper;
  }

  @Override
  public void writeGenerator(Generator generator) {
    fileWriter.writeJSON(generator.getName(), generatorJSONMapper.parseGeneratorToJSON(generator));
  }
}
