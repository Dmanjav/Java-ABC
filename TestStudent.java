public class TestStudent {

    public static void main(String[] args) {
        
        // 1. Crear una instancia (objeto) de la clase Student
        Student estudiante1 = new Student();

        // 2. Usar los SETTERS para asignar valores a los campos privados
        System.out.println("-> Asignando datos al estudiante...");
        estudiante1.setStudentId("1024");
        estudiante1.setStudentName("Luis Pérez");
        estudiante1.setCollegeName("Instituto Nacional de Tecnología");
        estudiante1.setAddress("Av. Los Libertadores #45");

        System.out.println("---------------------------------------------");

        // 3. Usar los GETTERS para recuperar y mostrar los valores
        System.out.println("-> Verificando y mostrando los datos:");
        System.out.println("ID del Estudiante: " + estudiante1.getStudentId());
        System.out.println("Nombre: " + estudiante1.getStudentName());
        System.out.println("Dirección: " + estudiante1.getAddress());
        System.out.println("Nombre de la Universidad: " + estudiante1.getCollegeName());
        
        System.out.println("---------------------------------------------");
        System.out.println("Prueba completada. Los datos fueron asignados y leídos correctamente.");
    }
}