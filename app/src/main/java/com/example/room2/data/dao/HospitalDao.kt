package com.example.room2.data.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.room2.data.tables.*
import com.example.room2.data.tables.Hospital

interface Hospital {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHospital(hospital: Hospital)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHod(hod: Hod)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDoctor(doctor: Doctors)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPatient(patients: Patients)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDoctorPatientCrossRef(doctorPatientDoctorCrossRef: PatientDoctorCrossRef)

    @Transaction
    @Query("SELECT * FROM patients where patientName = :patientName")
    suspend fun getAllPatientsWithDoctors(patientName: String):List<HospitalAndHod>

    @Transaction
    @Query("SELECT * FROM doctors where doctorName = :doctorName")
    suspend fun getAllDoctorsWithPatients(doctorName: String):List<HospitalAndHod>

    @Transaction
    @Query("SELECT * FROM hospital where hospitalName = :hospitalName")
    suspend fun getAllHospitalWithDoctors(hospitalName: String):List<HospitalAndHod>

    @Transaction
    @Query("SELECT * FROM hospital where hospitalName = :hospitalName")
    suspend fun getAllHospitalAndHod(hospitalName: String):List<HospitalAndHod>
}