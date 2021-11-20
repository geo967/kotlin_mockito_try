package com.example.mokito_test

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {

    @Mock
    lateinit var operators:Operators
    private lateinit var calculator:Calculator
    @Before
    fun onSetup(){
        calculator=Calculator(operators)
    }

    @Test
    fun givenValidInput_whenAdd_shouldCallAddOperator() {
        val a = 10
        val b = 20
        calculator.addTwoNumbers(a, b)
        verify(operators).add(a, b)

    }

}