/*
 *
 *  License Terms
 *
 *  Copyright (c) 2015, California Institute of Technology ("Caltech").
 *  U.S. Government sponsorship acknowledged.
 *
 *  Copyright (c) 2015, Airbus Operations S.A.S.
 *
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 *
 *
 *   *   Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 *   *   Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the
 *       distribution.
 *
 *   *   Neither the name of Caltech nor its operating division, the Jet
 *       Propulsion Laboratory, nor the names of its contributors may be
 *       used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 *  IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 *  PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 *  OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.omg.oti.json.uml.enums

import play.json.extra._
import play.api.libs.json._

/**
  * ParameterEffectKind is an Enumeration that indicates the effect of a Behavior on values passed in or out of its parameters.
  *
  * <!-- Start of user code documentation -->
  * <!-- End of user code documentation -->
  */
sealed trait UMLParameterEffectKind {}

object UMLParameterEffectKind {

  /**
    * Indicates that the behavior creates values.
    *
    * <!-- Start of user code doc for create -->
    * <!-- End of user code doc for create -->
    */
  case object create extends UMLParameterEffectKind {}

  /**
    * Indicates objects that are values of the parameter do not exist after executions of the behavior are finished.
    *
    * <!-- Start of user code doc for delete -->
    * <!-- End of user code doc for delete -->
    */
  case object delete extends UMLParameterEffectKind {}

  /**
    * Indicates objects that are values of the parameter have values of their properties, or links in which they participate, or their classifiers retrieved during executions of the behavior.
    *
    * <!-- Start of user code doc for read -->
    * <!-- End of user code doc for read -->
    */
  case object read extends UMLParameterEffectKind {}

  /**
    * Indicates objects that are values of the parameter have values of their properties, or links in which they participate, or their classification changed during executions of the behavior.
    *
    * <!-- Start of user code doc for update -->
    * <!-- End of user code doc for update -->
    */
  case object update extends UMLParameterEffectKind {}
 
  implicit val formatsUMLParameterEffectKind
  : Format[UMLParameterEffectKind]
  = Variants.format[UMLParameterEffectKind]
  
  implicit val writesUMLParameterEffectKind
  : Writes[UMLParameterEffectKind]
  = Variants.writes[UMLParameterEffectKind]

  implicit val readsUMLParameterEffectKind
  : Reads[UMLParameterEffectKind]
  = Variants.reads[UMLParameterEffectKind]
}
