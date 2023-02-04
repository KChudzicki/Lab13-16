package interfaces;

public class DataProviderApp {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new SimpleDataProvider();//tutaj podmieniamy data Providera

        dataPresenter.showData(dataProvider);
    }


}

