package lfe.sample.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Optional;


import lfe.sample.model.Employee;
import lfe.sample.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Autowired
    private WebApplicationContext context;

    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

   // //@Test
    public void testCreateEmployee() throws Exception {
        Employee employee = new Employee("John", "Doe", "john.doe@example.com");

        Mockito.when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/employees")
                        .content(objectMapper.writeValueAsString(employee))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("John"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.emailId").value("john.doe@example.com"));
    }

  //  @Test
    public void testGetEmployeeById() throws Exception {
        Employee employee = new Employee("John", "Doe", "john.doe@example.com");

        Mockito.when(employeeRepository.findById(anyLong())).thenReturn(Optional.of(employee));

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/api/employees/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("John"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.emailId").value("john.doe@example.com"));
    }

   // @Test
    public void testGetAllEmployees() throws Exception {
        Employee employee1 = new Employee("John", "Doe", "john.doe@example.com");
        Employee employee2 = new Employee("Jane", "Doe", "jane.doe@example.com");

        Mockito.when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee1, employee2));

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/api/employees")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].firstName").value("John"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].lastName").value("Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].emailId").value("john.doe@example.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].firstName").value("Jane"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].lastName").value("Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].emailId").value("jane.doe@example.com"));
    }

   // @Test
    public void testUpdateEmployee() throws Exception {
        Employee existingEmployee = new Employee("John", "Doe", "john.doe@example.com");
        Employee updatedEmployee = new Employee("John", "Smith", "john.smith@example.com");

        Mockito.when(employeeRepository.findById(anyLong())).thenReturn(Optional.of(existingEmployee));
        Mockito.when(employeeRepository.save(any(Employee.class))).thenReturn(updatedEmployee);

        mockMvc.perform(MockMvcRequestBuilders
                        .put("/api/employees/1")
                        .content(objectMapper.writeValueAsString(updatedEmployee))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("John"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("Smith"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.emailId").value("john.smith@example.com"));
    }

    @Test
    public void testDeleteEmployee() throws Exception {
        Employee employee = new Employee("John", "Doe", "john.doe@example.com");

        Mockito.when(employeeRepository.findById(anyLong())).thenReturn(Optional.of(employee));
        Mockito.doNothing().when(employeeRepository).delete(any(Employee.class));

        mockMvc.perform(MockMvcRequestBuilders
                        .delete("/api/employees/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    @Test
    public void whenValidUser_thenReturns200() throws Exception {
        // Mock the repository behavior
        Mockito.when(employeeRepository.save(Mockito.any())).thenReturn(null);
        mockMvc.perform(post("/api/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"firstName\":\"John Doe\"}"))
                .andExpect(status().isCreated());
    }

    @Test
    public void whenBlankName_thenReturnsBadRequest() throws Exception {
        mockMvc.perform(post("/api/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"firstName\":\"\"}"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void sampleTest() {
        //assert
    }
}
