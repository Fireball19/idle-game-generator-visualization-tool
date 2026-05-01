# idle-game-generator-visualization-tool

[![Java CI with Gradle](https://github.com/Fireball19/idle-game-generator-visualization-tool/actions/workflows/gradle.yml/badge.svg)](https://github.com/Fireball19/idle-game-generator-visualization-tool/actions/workflows/gradle.yml)

## The mathematical formulas

### Cost

$cost_{next} = cost_{base} \times (rate_{growth})^{owned}$

### Production per second

$production_{total} = ((production_{base} \times owned) \times multipliers) \div productiontime$

Thanks to Anthony Pecorella (The Math of Idle Games)!

## How to run

First you should clone the repository.

```
git clone https://github.com/Fireball19/idle-game-generator-visualization-tool.git
```

Then use Gradle to run the application.

```
./gradlew run
```

## How it looks

![Screenshot of the idle-game-generator-visualization-tool](docs/screenshots/how_it_looks.png)
