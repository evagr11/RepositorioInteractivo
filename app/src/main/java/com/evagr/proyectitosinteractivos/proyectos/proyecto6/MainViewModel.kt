package com.evagr.proyectitosinteractivos.proyectos.proyecto6

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {
    /*
    var nombre by mutableStateOf("")
        private set

    var contador by mutableStateOf(0)
        private set

    fun cambiarNombre(nuevoNombre : String){
        nombre = nuevoNombre
    }

    fun incrementarContador(){
        contador++
    }

    fun disminuirContador(){
        contador--
    }

     */

    /*
    private val _uiState = MutableStateFlow(UIState())
    val uiState : StateFlow<UIState> = _uiState

    fun cambiarNombre(nuevoNombre : String){
        _uiState.update { currentState ->
            currentState.copy(nombre = nuevoNombre)
        }
    }

    fun incrementarContador(){
        _uiState.update { currentState ->
            currentState.copy(contador = currentState.contador+1)
        }
    }

    fun disminuirContador(){
        _uiState.update { currentState ->
            currentState.copy(contador = currentState.contador-1)
        }
    }
     */


    private val _uiState = MutableStateFlow(UIState())
    val uiState : StateFlow<UIState> = _uiState

    fun cambiarNombre(nuevoNombre : String){
        _uiState.update { currentState ->
            currentState.copy(nombre = nuevoNombre)
        }
    }


    fun cambiarContraseña(nuevaContraseña : String){
        _uiState.update { currentState ->
            currentState.copy(contraseña = nuevaContraseña)
        }
    }


}