package idle.game.generator.visualization.tool.domain.io;

import idle.game.generator.visualization.tool.domain.Generator;

public interface GeneratorReader {

  Generator readGenerator(String fileName);
}
