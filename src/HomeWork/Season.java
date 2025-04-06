package HomeWork;

public enum Season {
    WINTER("Зима очень холодная", -30),
    AUTUMN("Осень холодная", 10),
    SUMMER("Лето жароке", 30){
    @Override
    public String getDescription() {
        return "теплое время года";
    }
    },
    SPRING("Весна теплая", 15) {
        @Override
            public String getDescription() {
                return "теплое время года";
            }
            };

    private int averegeTemperature;
    private String descriptions;

    Season(String descriptions, int averegeTemperature) {
        this.descriptions = descriptions;
        this.averegeTemperature = averegeTemperature;
    }


    public int getAverageTemp() {
        return averegeTemperature;
    }

    public String getDescription(){
        return "холодное время года";
    }

    public void printSeasons(Season season){
        switch (season){
            case AUTUMN:
                System.out.println("Время года: осень\n" + AUTUMN.descriptions);
                System.out.println("средняя температура: " + AUTUMN.getAverageTemp());

            case WINTER:
                System.out.println("Время года: зима\n" + WINTER.descriptions);
                System.out.println("средняя температура: " + WINTER.getAverageTemp());

            case SPRING:
                System.out.println("Время года: весна\n" + SPRING.descriptions);
                System.out.println("средняя температура: " + SPRING.getAverageTemp());

            case SUMMER:
                System.out.println("Время года: лето\n" + SUMMER.descriptions);
                System.out.println("средняя температура: " + SUMMER.getAverageTemp());
        }

    }



}
