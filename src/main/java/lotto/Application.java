package lotto;

import lotto.controller.LottoPurchaseController;
import lotto.controller.LottoWinningController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        LottoPurchaseController purchase = new LottoPurchaseController();
        purchase.purchaseLotto();

        LottoWinningController winning = new LottoWinningController();
        winning.winningLotto();
    }
}
