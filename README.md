# SpringFrameworkDay7
========================================================================================================================================
Problem Statement 2: What should you prefer - using constructor injection VS property injection and why. Try to explain using an example.
========================================================================================================================================

Constructor injection is used when the class cannot function without the dependent class.

Property injection is used when the class can function without the dependent class.

As a concrete example, consider a ServiceRepository which depends on IService to do its work. Since ServiceRepository cannot function usefully without IService, it makes sense to have it injected via the constructor.

The same ServiceRepository class may use a Logger to do tracing. The ILogger can be injected via Property injection.

Other common examples of Property injection are ICache (another aspect in AOP terminology) or IBaseProperty (a property in the base class).
==========================================================================================================================================
