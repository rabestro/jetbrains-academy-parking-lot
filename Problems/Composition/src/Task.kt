// write the classes here
class OperatingSystem(var name: String = "Windows")
class DualBoot(
        var primaryOs: OperatingSystem = OperatingSystem("Linux"),
        var secondaryOs: OperatingSystem = OperatingSystem())