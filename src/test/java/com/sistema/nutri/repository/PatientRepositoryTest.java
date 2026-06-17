package com.sistema.nutri.repository;

import com.sistema.nutri.entities.Patient;
import com.sistema.nutri.enums.EnumMainObjective;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class PatientRepositoryTest
{
    @Autowired
    PatientRepository repository;

    private static final String NAME = "Bruno Vale";

    private static final String CPF = "18878602651";

    private static final String PHONE_NUMBER = "27992878536";

    private static final LocalDateTime BIRTH_DATE = LocalDateTime.now();

    private static final EnumMainObjective OBJECTIVE = EnumMainObjective.HIPERTROFIA;

    private static final List<String> FOOD_RESTRICTIONS = List.of("INTOLERANTE A LACTOSE", "ALERGIA A PIMENTA");

    @Test
    public void testPersistence()
    {
        var p = new Patient();
        p.setName(NAME);
        p.setCpf(CPF);
        p.setPhone_number(PHONE_NUMBER);
        p.setBirthDate(BIRTH_DATE);
        p.setObjective(OBJECTIVE);
        p.setFood_restrictions(FOOD_RESTRICTIONS);

        var newPatient = repository.save(p);

        assertNotNull(newPatient.getId());

        assertEquals(NAME, newPatient.getName());
        assertEquals(CPF, newPatient.getCpf());
        assertEquals(PHONE_NUMBER, newPatient.getPhone_number());
        assertEquals(BIRTH_DATE, newPatient.getBirthDate());
        assertEquals(OBJECTIVE, newPatient.getObjective());
        assertEquals(FOOD_RESTRICTIONS, newPatient.getFood_restrictions());

        System.out.println(newPatient.toString());

    }
}