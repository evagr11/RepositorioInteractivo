package com.evagr.proyectitosinteractivos.proyectos.proyecto6

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

/**
 * ViewModel del login avanzado. Guarda el estado en un `MutableStateFlow` privado
 * y lo expone como [uiState], de solo lectura.
 */
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
    /**
     * Estado que observa la pantalla.
     */
    val uiState : StateFlow<UIState> = _uiState

    /**
     * Cambia el nombre en el estado.
     *
     * @param nuevoNombre nombre escrito.
     */
    fun cambiarNombre(nuevoNombre : String){
        _uiState.update { currentState ->
            currentState.copy(nombre = nuevoNombre)
        }
    }


    /**
     * Cambia la contraseña en el estado.
     *
     * @param nuevaContraseña contraseña escrita.
     */
    fun cambiarContraseña(nuevaContraseña : String){
        _uiState.update { currentState ->
            currentState.copy(contraseña = nuevaContraseña)
        }
    }


}