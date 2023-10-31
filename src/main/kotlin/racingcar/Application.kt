package racingcar

import InputUser

fun main() {
   val inputUser = InputUser()
   val gamePlaying = Racing()
   val carNames = inputUser.inputCarName()
   var gameInfo = emptyMap<String, Int>()

   if (inputUser.validName(carNames)) {
      val gameCount = inputUser.tryGameCount()
      gamePlaying.outputStartMent()
      if (inputUser.validName(carNames)) {
         for (round in 1..gameCount) {
            gameInfo = gamePlaying.generateNumber(carNames)
            gamePlaying.printPerExecutionResult(gameInfo)
         }
      }
   }

      val scoreList = gamePlaying.calculateScore(gameInfo)
      val topScore = gamePlaying.findTopScoreList(scoreList)
      gamePlaying.printlnTopScore(topScore)
   }
