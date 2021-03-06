USE [master]
GO
/****** Object:  Database [FlowerShop]    Script Date: 6/17/2018 1:02:17 PM ******/
CREATE DATABASE [FlowerShop]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'FlowerShop', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\FlowerShop.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'FlowerShop_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\FlowerShop_log.ldf' , SIZE = 560KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [FlowerShop] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [FlowerShop].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [FlowerShop] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [FlowerShop] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [FlowerShop] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [FlowerShop] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [FlowerShop] SET ARITHABORT OFF 
GO
ALTER DATABASE [FlowerShop] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [FlowerShop] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [FlowerShop] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [FlowerShop] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [FlowerShop] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [FlowerShop] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [FlowerShop] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [FlowerShop] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [FlowerShop] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [FlowerShop] SET  ENABLE_BROKER 
GO
ALTER DATABASE [FlowerShop] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [FlowerShop] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [FlowerShop] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [FlowerShop] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [FlowerShop] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [FlowerShop] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [FlowerShop] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [FlowerShop] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [FlowerShop] SET  MULTI_USER 
GO
ALTER DATABASE [FlowerShop] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [FlowerShop] SET DB_CHAINING OFF 
GO
ALTER DATABASE [FlowerShop] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [FlowerShop] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [FlowerShop] SET DELAYED_DURABILITY = DISABLED 
GO
USE [FlowerShop]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 6/17/2018 1:02:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[product_id] [int] IDENTITY(1,1) NOT NULL,
	[product_title] [varchar](50) NULL,
	[product_name] [varchar](50) NULL,
	[product_image] [varchar](100) NULL,
	[product_description] [text] NULL,
PRIMARY KEY CLUSTERED 
(
	[product_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[UserProduct]    Script Date: 6/17/2018 1:02:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[UserProduct](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userName] [varchar](50) NULL,
	[passWord] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (1, N'Product title', N'User 1', N'images/flower-1.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (2, N'Product title', N'User 2', N'images/flower-2.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (3, N'Product title', N'User 3', N'images/flower-3.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (4, N'Product title', N'User 4', N'images/flower-4.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (5, N'Product title', N'User 5', N'images/flower-1.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (6, N'Product title', N'User 6', N'images/flower-1.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (7, N'Product title', N'User 7', N'images/flower-1.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (8, N'Product title', N'User 8', N'images/flower-1.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
INSERT [dbo].[Product] ([product_id], [product_title], [product_name], [product_image], [product_description]) VALUES (9, N'Product title', N'User 9', N'images/flower-1.jpg', N'Love''s divine, and roses are too. At almost two feet tall, this beautiful mix of red and white roses - accented with Queen Anne''s Lace, and adorned with a bold red ribbon - is a timeless gift for your beloved.')
SET IDENTITY_INSERT [dbo].[Product] OFF
SET IDENTITY_INSERT [dbo].[UserProduct] ON 

INSERT [dbo].[UserProduct] ([id], [userName], [passWord]) VALUES (1, N'duy', N'1234')
SET IDENTITY_INSERT [dbo].[UserProduct] OFF
USE [master]
GO
ALTER DATABASE [FlowerShop] SET  READ_WRITE 
GO
