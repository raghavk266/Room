package com.example.room2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.room2.data.db.HospitalDatabase
import com.example.room2.data.tables.*
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val databasedao = HospitalDatabase.getInstance(this).hospitalDao()
        lifecycleScope.launch{
            databasedao.insertHospital(Hospital("Dog Hospital"))
            databasedao.insertHospital(Hospital("Cat Hospital"))
            databasedao.insertHospital(Hospital("Giraffe Hospital"))
            databasedao.insertHospital(Hospital("Hippo Hospital"))
            databasedao.insertHospital(Hospital("Penguin Hospital"))
        }
        lifecycleScope.launch{
            databasedao.insertDoctor(Doctors("Mr Omni Retriever","Cardiogist","Dog Hospital"))
            databasedao.insertDoctor(Doctors("Mr Puggy Twoshoes","Anesthesiologist","Dog Hospital"))
            databasedao.insertDoctor(Doctors("Mrs Sassy Shorthair","Dermatologist","Cat Hospital"))
            databasedao.insertDoctor(Doctors("Mr Longhead necks","Endocrinologist","Giraffe Hospital"))
            databasedao.insertDoctor(Doctors("Mrs Longbottom Bigmouth","Gastroenterologist","Hippo Hospital"))
            databasedao.insertDoctor(Doctors("Mrs Goody Flatfeet","Dentist","Penguin Hospital"))
        }
        lifecycleScope.launch{
            databasedao.insertHod(Hod("Mr Long","Cardiologist","Giraffe Hospital"))
            databasedao.insertHod(Hod("Mr Fat","Gastroenterlogist","Hippo Hospital"))
            databasedao.insertHod(Hod("Mrs Sass","Dermetologist","Cat Hospital"))
            databasedao.insertHod(Hod("Mr Greed","Hematologist","Dog Hospital"))
            databasedao.insertHod(Hod("Mrs Flatfeet","Gynaecologist","Penguin Hospital"))
        }
        lifecycleScope.launch{
            databasedao.insertPatient(Patients("Mr Short","Short height"))
            databasedao.insertPatient(Patients("Mr Roach","Short height"))
            databasedao.insertPatient(Patients("Mr Mouser","Short height"))
            databasedao.insertPatient(Patients("Mr Skin","Too slim"))
            databasedao.insertPatient(Patients("Mr Slim","Too slim"))
            databasedao.insertPatient(Patients("Mrs Reck","Loss of appetite"))
            databasedao.insertPatient(Patients("Mrs Depp","Loss of appetite"))
            databasedao.insertPatient(Patients("Mrs Loss","Loss of appetite"))
            databasedao.insertPatient(Patients("Mr Dumb","Dumbness"))
            databasedao.insertPatient(Patients("Mr Virgin","Dumbness"))
            databasedao.insertPatient(Patients("Mrs Usain","cannot run"))
        }
        lifecycleScope.launch {
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Short","Mr Long"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Roach","Mr Long"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Mouser","Mr Long"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Skin","Mr Fat"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Slim","Mr Fat"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Reck","Mr Greed"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Depp","Mr Greed"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Loss","Mr Greed"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Virgin","Mrs Sass"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Dumb","Mrs Sass"))
            databasedao.insertDoctorPatientCrossRef(PatientDoctorCrossRef("Mr Usain","Mrs Flatfeet"))
        }
    }
}