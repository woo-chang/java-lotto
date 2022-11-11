package lotto.service;

import java.util.List;
import lotto.entity.Lotto;

public class OutputService {

    private static final String PURCHASE_MESSAGE = "개를 구매했습니다.";
    private static final String WIN_STATUS_MESSAGE = "당첨 통계";
    private static final String LINE = "---";
    private static final String RATE_OF_RETURN_MESSAGE = "총 수익률은 %.1f입니다.\n";

    public void printGeneratedLottos(List<Lotto> lottos) {
        System.out.println(lottos.size() + PURCHASE_MESSAGE);
        lottos.forEach(System.out::println);
    }

    public void printRateOfReturn(Double rate) {
        System.out.printf(RATE_OF_RETURN_MESSAGE, rate);
    }

}