package Transport.Survice_station;

public class ServiceStation {
    private String serviceStation;

    public ServiceStation(String serviceStation) {
        this.serviceStation = serviceStation;
    }

    public String getServiceStation() {
        return serviceStation;
    }

    public void setServiceStation(String serviceStation) {
        this.serviceStation = serviceStation;
    }

    public void service(WheeledTransport transport) {
        System.out.print(serviceStation + " - ");
        transport.service();
    }
}
